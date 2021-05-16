package de.ckraus.services.clients;

import org.springframework.web.util.DefaultUriBuilderFactory;

import java.net.URI;

public interface ServiceClientResource {

    Client getClient();

    String getSchema();

    String getHost();

    int getPort();

    String getPath();

    default URI getURI() {
        return new DefaultUriBuilderFactory().builder()
                .scheme( this.getSchema() )
                .host( this.getHost() ).port( this.getPort() )
                .path( this.getPath() )
                .build( ( Object[] ) null );
    }

    default String getUrl() {
        return this.getURI().toString();
    }
}
