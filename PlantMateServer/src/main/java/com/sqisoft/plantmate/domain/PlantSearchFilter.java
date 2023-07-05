/*
 * 
 */
package com.sqisoft.plantmate.domain;

import java.io.Serializable;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author jynius
 */
@Data
public class PlantSearchFilter implements Serializable {

	private static final long serialVersionUID = 37113477693590836L;

	private static final String URL = "http://openapi.nature.go.kr/openapi/service/rest/PlantService/";
	private static final String FORMAT0 = "%s?serviceKey=%s&sw=%s&st=%d&numOfRows=%d&pageNo=%d&dateGbn=%s";
	private static final String FORMAT1 = "%s?serviceKey=%s&sw=%s&st=%d&numOfRows=%d&pageNo=%d";
	private static final String SERVICE_KEY = "eB0CgsA%2F4xRPNWM957Q2fvme6hxiDNwezUHefI0Oc%2B8KUEXkEC0Q1ynJ9S7kie%2FA1UrpPDjjnj7WBWY8kYKXpw%3D%3D";

    @JsonIgnore
    public static URI getUri(String type, String id) {
    	String query = String.format("%s?serviceKey=%s&q1=%s", type, SERVICE_KEY, id);
    	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + query);
    	return builder.build(true).toUri();
    }

	private static enum Type {
		PLANT_WORD_SEARCH ("51600", "plantWordSearch",    "식물용어사전 목록 조회"),                                                
		NATURALIZED_SEARCH("51586", "naturalizedSearch2", "외래식물 목록 검색"),                                                
		PLNT_ILSTR_SEARCH ("51588", "plntIlstrSearch",    "식물도감 목록 검색"),                                                
		SPCM_SEARCH       ("51590", "spcmSearch",         "식물표본 목록 검색"),                                                
		SEED_SEARCH       ("51592", "seedSearch",         "식물종자 목록 검색"),                                                
		NRFST_SEARCH      ("51594", "nrfstSearch",        "보호림 목록 검색"),                                                
		FOLK_SEARCH       ("51596", "folkSearch",         "민속식물 목록 검색"),                                                
		PLNT_RARE_SEARCH  ("51598", "plntRareSearch",     "희귀/특산식물 목록 검색"),                                                
		NRTR_SEARCH       ("51601", "nrtrSearch",         "보호수 목록 검색"),                                                
		RMIN_SEARCH       ("51603", "rminSearch",         "보유식물 목록 검색"),                                                
		NATURALIZED_INFO  ("51587", "naturalizedInfo2",   "외래식물 상세정보 조회"),                                                
		PLNT_ILSTR_INFO   ("51589", "plntIlstrInfo",      "식물도감 상세정보 조회"),                                                
		SPCM_INFO         ("51591", "spcmInfo",           "식물표본 상세정보 조회"),                                                
		SEED_INFO         ("51593", "seedInfo",           "식물종자 상세정보 조회"),                                                
		NRFST_INFO        ("51595", "nrfstInfo",          "보호림 상세정보 조회"),                                                
		FOLK_INFO         ("51597", "folkInfo",           "민속식물 상세정보 조회"),                                                
		PLNT_RARE_INFO    ("51599", "plntRareInfo",       "희귀/특산식물 상세정보 조회"),                                                
		NRTR_INFO         ("51602", "nrtrInfo",           "보호수 상세정보 조회"),                                                
		RMIN_INFO         ("51604", "rminInfo",           "보유식물 상세정보 조회");
		
		@SuppressWarnings("unused")
		private String code;
		private String path;
		@SuppressWarnings("unused")
		private String name;
		private Type(String code, String path, String title) {
			this.code = code;
			this.path = path;
			this.name = title;
		}
	}

	private Type type = Type.PLNT_ILSTR_SEARCH;
    private String dateGbn = ""; // 빈칸-전체/1-등록일/2-수정일
    private int st = 1; // 1 국명 / 2 학명 / 3 국명일치 / 4 학명일치
    private String sw;

    private int numOfRows = 10;
    private int pageNo = 1;

    @JsonIgnore
    public URI getUri() {
    	
        String query;
    	switch(type) {
    	case PLANT_WORD_SEARCH:
    		query = String.format(FORMAT1, type.path, SERVICE_KEY, encode(sw), st, numOfRows, pageNo);
    		break;
    	case PLNT_ILSTR_SEARCH:
    	case FOLK_SEARCH:
    	default:
    		query = String.format(FORMAT0, type.path, SERVICE_KEY, encode(sw), st, numOfRows, pageNo, dateGbn);
    		break;
    	}
    	
    	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL + query);
    	return builder.build(true).toUri();
    }

	private String encode(String s) {
		return URLEncoder.encode(s, Charset.forName("UTF-8"));
	}
}
