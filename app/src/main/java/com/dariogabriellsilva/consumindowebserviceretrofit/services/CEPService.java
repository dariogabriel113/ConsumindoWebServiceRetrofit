package com.dariogabriellsilva.consumindowebserviceretrofit.services;

import com.dariogabriellsilva.consumindowebserviceretrofit.model.CEP;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CEPService {

    @GET("cep/find/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);
}
