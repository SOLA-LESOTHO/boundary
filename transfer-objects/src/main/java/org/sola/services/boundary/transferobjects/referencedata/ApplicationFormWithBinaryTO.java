package org.sola.services.boundary.transferobjects.referencedata;

public class ApplicationFormWithBinaryTO extends ApplicationFormTO {
    private byte[] content;
    private String extension;
    
    public ApplicationFormWithBinaryTO(){
        super();
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
