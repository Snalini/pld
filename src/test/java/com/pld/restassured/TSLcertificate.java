package com.pld.restassured;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class TSLcertificate {

	public static void main(String[] args) {
	}
		
		public HttpClient createTlsV2HttpClient() throws KeyManagementException,
        UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {

SSLContext sslContext = SSLContext.getInstance("TLSv1.2");

SSLConnectionSocketFactory f = new SSLConnectionSocketFactory(sslContext, new String[] { "TLSv1.2" }, null,
                                SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", f)
                .build();

PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);

CloseableHttpClient client = HttpClients
                .custom()
                .setSSLSocketFactory(f)
                .setConnectionManager(cm)
                .build();
return client;
}

	}


