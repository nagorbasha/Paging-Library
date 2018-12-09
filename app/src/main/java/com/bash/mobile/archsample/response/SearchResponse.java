package com.bash.mobile.archsample.response;

import java.util.List;

public class SearchResponse {
    /**
     * kind : youtube#searchListResponse
     * etag : "XI7nbFXulYBIpL0ayR_gDh3eu1k/LqpWyDUx6s3GhM4asfZ2dBcq6uU"
     * nextPageToken : CAUQAA
     * regionCode : IN
     * pageInfo : {"totalResults":1000000,"resultsPerPage":5}
     * items : [{"kind":"youtube#searchResult","etag":"\"XI7nbFXulYBIpL0ayR_gDh3eu1k/0LG4Jg0EV14c5UiMLdaaet_v2CM\"","id":{"kind":"youtube#video","videoId":"UOxkGD8qRB4"},"snippet":{"publishedAt":"2018-11-03T07:30:00.000Z","channelId":"UC2t5bjwHdUX4vM2g8TRDq5g","title":"K/DA - POP/STARS (ft Madison Beer, (G)I-DLE, Jaira Burns) | Official Music Video - League of Legends","description":"K/DA Ahri, K/DA Evelynn, K/DA Kai'Sa, and K/DA Akali take the world stage with their debut single. Keep the show going on the Rift with these new Epic skins.","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/hqdefault.jpg","width":480,"height":360}},"channelTitle":"League of Legends","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"XI7nbFXulYBIpL0ayR_gDh3eu1k/pqPk68pyu4UN0ALIfeVVFhIvYQo\"","id":{"kind":"youtube#video","videoId":"m7Bc3pLyij0"},"snippet":{"publishedAt":"2018-09-24T13:58:16.000Z","channelId":"UCEdvpU2pFRCVqU6yIPyTpMQ","title":"Marshmello ft. Bastille - Happier (Official Music Video)","description":"Marshmello ft. Bastille - Happier (Official Music Video) Download / Stream Happier ▷ http://marshmello.lnk.to/happier NEW Mello™   by Marshmello gear SHOP ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/m7Bc3pLyij0/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/m7Bc3pLyij0/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/m7Bc3pLyij0/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Marshmello","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"XI7nbFXulYBIpL0ayR_gDh3eu1k/1szGxIC2JpHOZayLDDyWY1wRMRg\"","id":{"kind":"youtube#video","videoId":"VRJmcxCrAOA"},"snippet":{"publishedAt":"2018-01-22T22:55:24.000Z","channelId":"UCRijo3ddMTht_IHyNSNXpNQ","title":"Real Life Trick Shots 2 | Dude Perfect","description":"Trick shots should be an everyday thing! Thanks to Kay Jewelers for sponsoring this video! Win Valentine's Day by going to http://dudeperfect.com/KayJewelers ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/VRJmcxCrAOA/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/VRJmcxCrAOA/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/VRJmcxCrAOA/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Dude Perfect","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"XI7nbFXulYBIpL0ayR_gDh3eu1k/BXe3JhjvG9gFHHIap7gKsMX0hac\"","id":{"kind":"youtube#video","videoId":"hHW1oY26kxQ"},"snippet":{"publishedAt":"2018-08-22T19:51:06.000Z","channelId":"UCSJ4gkVC6NrvII8umztf0Ow","title":"lofi hip hop radio - beats to relax/study to","description":"Thank you for listening, I hope you will have a good time here :) New merch available! → http://bit.ly/chilledcowmerch Listen to the radio offline with my ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/hHW1oY26kxQ/default_live.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/hHW1oY26kxQ/mqdefault_live.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/hHW1oY26kxQ/hqdefault_live.jpg","width":480,"height":360}},"channelTitle":"ChilledCow","liveBroadcastContent":"live"}},{"kind":"youtube#searchResult","etag":"\"XI7nbFXulYBIpL0ayR_gDh3eu1k/id3uz64VI_Frb6lxlzAYDG8yCuw\"","id":{"kind":"youtube#video","videoId":"A2FsgKoGD04"},"snippet":{"publishedAt":"2017-05-25T21:58:58.000Z","channelId":"UCRijo3ddMTht_IHyNSNXpNQ","title":"Real Life Trick Shots | Dude Perfect","description":"Trick shots should be an everyday thing! Thanks to Kingsford for sponsoring this video! ▻ Click HERE to subscribe to Dude Perfect! http://bit.ly/SubDudePerfect ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/A2FsgKoGD04/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/A2FsgKoGD04/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/A2FsgKoGD04/hqdefault.jpg","width":480,"height":360}},"channelTitle":"Dude Perfect","liveBroadcastContent":"none"}}]
     */

    private String kind;
    private String etag;
    private String nextPageToken;
    private String prevPageToken;
    private String regionCode;
    private PageInfoBean pageInfo;
    private List<VideoItem> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfoBean getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoBean pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<VideoItem> getItems() {
        return items;
    }

    public void setItems(List<VideoItem> items) {
        this.items = items;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }

    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    public static class PageInfoBean {
        /**
         * totalResults : 1000000
         * resultsPerPage : 5
         */

        private int totalResults;
        private int resultsPerPage;

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }
    }

}
