package af.asr.provisioner.service.internal.repository;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(name = ClientEntity.TABLE_NAME)
public class ClientEntity {

    static final String TABLE_NAME = "clients";
    static final String NAME_COLUMN = "name";
    static final String DESCRIPTION_COLUMN = "description";
    static final String REDIRECT_URI_COLUMN = "redirect_uri";
    static final String VENDOR_COLUMN = "vendor";
    static final String HOMEPAGE_COLUMN = "homepage";

    @PartitionKey
    @Column(name = NAME_COLUMN)
    private String name;
    @Column(name = DESCRIPTION_COLUMN)
    private String description;
    @Column(name = REDIRECT_URI_COLUMN)
    private String redirectUri;
    @Column(name = VENDOR_COLUMN)
    private String vendor;
    @Column(name = HOMEPAGE_COLUMN)
    private String homepage;

    public ClientEntity() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}