package com.example.jacklee.airport;

public class Airport {
    private String airportName;
    private int imageResourceId;

    public Airport(String airportName) {
        this.airportName = airportName;
    }

    public Airport(String airportName, int imageResourceId){
        this.airportName = airportName;
        this.imageResourceId = imageResourceId;
    }

    public String getAirportName() {
        return airportName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    class Shop {
        private String shopName;
        private int imageResourceId;
        private String content;

        //private String location;
        public Shop(String shopName) {
            this.shopName = shopName;
        }

        public Shop(String shopName, int imageResourceId, String content){
            this.shopName = shopName;
            this.imageResourceId = imageResourceId;
            this.content = content;
        }

        public String getShopName() {
            return shopName;
        }

        public int getImageResourceId(){
            return imageResourceId;
        }

        public String getContent(){
            return content;
        }

    }

/*    class EatShop {
        private String shopName;
        private int imageResourceId;
        private String content;

        public EatShop(String shopName){
            this.shopName = shopName;
        }
    }

    class RestShop {
        private String shopName;
        private int imageResourceId;
        private String content;

        public RestShop(String shopName){
            this.shopName = shopName;

        }
    }*/
}
