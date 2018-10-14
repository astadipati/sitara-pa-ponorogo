package net.ramastudio.sitaraponorogo.utils.api;

public class UtilsApi {

//    tuban punya
//    public static final String BASE_URL_API = "http://iix.pa-tuban.go.id/";
//    ponorogo punya
    public static final String BASE_URL_API = "http://iix.pa-ponorogo.go.id/";

    // Mendeklarasikan Interface BaseApiService
    public static ApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(ApiService.class);
    }
}
