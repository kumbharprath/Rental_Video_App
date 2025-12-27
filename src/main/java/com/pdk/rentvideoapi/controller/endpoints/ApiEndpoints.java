package com.pdk.rentvideoapi.controller.endpoints;


public class ApiEndpoints {
    public static final String RENTVIDEOAPP_API_ENDPOINT = "/api/v1";
    public static final String USER_API_ENDPOINT = "/auth/register";
    public static final String VIDEO_API_ENDPOINT = "/auth/videos";
    public static final String VIDEO_ADMIN_API_ENDPOINT = "/admin/videos";
    public static final String PUBLIC_API_ENDPOINT = RENTVIDEOAPP_API_ENDPOINT + "/auth/**";
    public static final String ADMIN_ONLY_API_ENDPOINT = RENTVIDEOAPP_API_ENDPOINT + "/admin/**";
}
