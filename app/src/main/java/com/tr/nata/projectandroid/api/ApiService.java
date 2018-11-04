package com.tr.nata.projectandroid.api;

import com.tr.nata.projectandroid.model.Response;
import com.tr.nata.projectandroid.model.user;
import com.tr.nata.projectandroid.model.userLogin;
//import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @FormUrlEncoded
    @POST("login")
    Call<userLogin>login(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("register")
    Call<Response>addUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );


}
