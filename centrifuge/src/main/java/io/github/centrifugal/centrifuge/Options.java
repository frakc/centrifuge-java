package io.github.centrifugal.centrifuge;

import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;

/**
 * Configuration for a {@link Client} instance.
 */
public class Options {
    private static final int DEFAULT_TIMEOUT = 5000;
    private static final int DEFAULT_PING_INTERVAL = 25000;

    private int timeout = DEFAULT_TIMEOUT;
    private int pingInterval = DEFAULT_PING_INTERVAL;

    private CertificatePinner certificatePinner = null;
    private SSLContext sslContext = null;
    private X509TrustManager trustManager = null;

    public String getPrivateChannelPrefix() {
        return privateChannelPrefix;
    }

    public CertificatePinner getCertificatePinner() {
        return certificatePinner;
    }

    public SSLContext getSslContext() {
        return sslContext;
    }

    public void setSslContext(SSLContext sslContext) {
        this.sslContext = sslContext;
    }

    public X509TrustManager getTrustManager() {
        return trustManager;
    }

    public void setTrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public void setCertificatePinner(CertificatePinner certificatePinner) {
        this.certificatePinner = certificatePinner;
    }

    public void setPrivateChannelPrefix(String privateChannelPrefix) {
        this.privateChannelPrefix = privateChannelPrefix;
    }

    private String privateChannelPrefix = "$";

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    private Map<String, String> headers;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getPingInterval() {
        return pingInterval;
    }

    public void setPingInterval(int pingInterval) {
        this.pingInterval = pingInterval;
    }
}
