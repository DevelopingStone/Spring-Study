package com.knight.api;

import java.io.IOException;
import retrofit2.Call;

public class ApiMain {

  public static void main(String[] args) {

    Call<Object> result = RetrofitClient.getApi().getUsers(1);

    try{
      System.out.println(result.execute().body());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
