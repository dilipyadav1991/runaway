package com.example.postgresdemo.utils;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class MdcUtils {
    private static final Logger logger = LoggerFactory.getLogger(MdcUtils.class);
    public static final String AUTOFIND_FIND_REQUEST_JOB_ID = "autofind_SEARCHER_job_id";
    public static final String AUTOFIND_SEARCHER_REQUEST_JOB_ID = "search_request_job_id";
    public static final String TENANT_ID = "tenant_id";
    public static final String LOCATION_ID = "location_id";
    public static final String SOURCE = "source";
    public static final String STATUS = "status";

    public static void addAutofindSearchResponseResult() {
    }

    public static void removeAutofindSearchRequestJob() {
    }

    public static void removeAutofindSearchResponseResult() {
    }

    public static void put(String argMdcKey, String argValue) {
        if (argMdcKey != null) {
            MDC.put(argMdcKey, argValue);
        }
    }

    public static void putAll(Map<String, String> keyValues) {
        if (keyValues != null && !keyValues.isEmpty()) {
            keyValues.forEach((k, v) -> {
                put(k, v);
            });
        }
    }

    public static void clearContext() {
        MDC.clear();
    }

    public static void removeKey(String argMdcKey) {
        if (argMdcKey != null) {
            MDC.remove(argMdcKey);
        }
    }

    public static void removeKeys(String... argMdcKeys) {
        if (argMdcKeys != null) {
            for (String mdcKey : argMdcKeys) {
                if (mdcKey != null) {
                    MDC.remove(mdcKey);
                }
            }
        }
    }
}
