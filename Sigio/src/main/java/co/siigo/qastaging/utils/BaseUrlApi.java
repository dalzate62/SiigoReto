package co.siigo.qastaging.utils;

public enum BaseUrlApi {

    BASE_URL_API("https://reqres.in");
    private final String uri;
    BaseUrlApi(String uri){this.uri=uri;}

    @Override
    public String toString(){return uri;}

}
