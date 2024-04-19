package ies.puerto.JDBC.config;


import ies.puerto.JDBC.exception.UsuarioException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    public AppConfig() throws UsuarioException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.properties")) {
            properties.load(fis);
            urlBd = (String) properties.get("urlBd");
        } catch (IOException e) {
            throw new UsuarioException(e.getMessage(),e);
        }
    }

    public String getUrlBd() {
        return urlBd;
    }
}
