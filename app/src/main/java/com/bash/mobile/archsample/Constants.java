package com.bash.mobile.archsample;

public interface Constants {

    String BASE_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet";

    String API_KEY = "AIzaSyDmRXtmlg4BmNfqyOHN3fK1SM7uzQMqoyc";

    String VIDEOS_LIST_URL = BASE_URL.concat("&type=video").concat("&maxResults=20").concat("&key=") + API_KEY;

    String VIDEOS_LIST_TOKEN_URL = VIDEOS_LIST_URL.concat("&pageToken=");

}
