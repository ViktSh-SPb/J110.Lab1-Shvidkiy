package org.viktsh;

public class Publisher {
    private String publisherName;
    private String publisherCity;

    public Publisher (String publisherName, String publisherCity){
        setPublisherName(publisherName);
        setPublisherCity(publisherCity);
    }

    public String getPublisherName(){return publisherName;}

    public String getPublisherCity(){return publisherCity;}

    public void setPublisherName(String publisherName) {
        if(publisherName!=null){
            this.publisherName = publisherName;
        }else {
            throw new NullPointerException("Название издательства не может быть "+ publisherName);
        }
    }

    public void setPublisherCity(String publisherCity) {
        if(publisherCity!=null){
            this.publisherCity = publisherCity;
        }else {
            throw new NullPointerException("Город не может быть "+ publisherCity);
        }
    }
}
