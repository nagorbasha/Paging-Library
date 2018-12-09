package com.bash.mobile.archsample.response;

public class VideoItem {
    /**
     * kind : youtube#searchResult
     * etag : "XI7nbFXulYBIpL0ayR_gDh3eu1k/0LG4Jg0EV14c5UiMLdaaet_v2CM"
     * id : {"kind":"youtube#video","videoId":"UOxkGD8qRB4"}
     * snippet : {"publishedAt":"2018-11-03T07:30:00.000Z","channelId":"UC2t5bjwHdUX4vM2g8TRDq5g","title":"K/DA - POP/STARS (ft Madison Beer, (G)I-DLE, Jaira Burns) | Official Music Video - League of Legends","description":"K/DA Ahri, K/DA Evelynn, K/DA Kai'Sa, and K/DA Akali take the world stage with their debut single. Keep the show going on the Rift with these new Epic skins.","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/hqdefault.jpg","width":480,"height":360}},"channelTitle":"League of Legends","liveBroadcastContent":"none"}
     */

    private String kind;
    private String etag;
    private IdBean id;
    private SnippetBean snippet;

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

    public IdBean getId() {
        return id;
    }

    public void setId(IdBean id) {
        this.id = id;
    }

    public SnippetBean getSnippet() {
        return snippet;
    }

    public void setSnippet(SnippetBean snippet) {
        this.snippet = snippet;
    }

    public static class IdBean {
        /**
         * kind : youtube#video
         * videoId : UOxkGD8qRB4
         */

        private String kind;
        private String videoId;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }
    }

    public static class SnippetBean {
        /**
         * publishedAt : 2018-11-03T07:30:00.000Z
         * channelId : UC2t5bjwHdUX4vM2g8TRDq5g
         * title : K/DA - POP/STARS (ft Madison Beer, (G)I-DLE, Jaira Burns) | Official Music Video - League of Legends
         * description : K/DA Ahri, K/DA Evelynn, K/DA Kai'Sa, and K/DA Akali take the world stage with their debut single. Keep the show going on the Rift with these new Epic skins.
         * thumbnails : {"default":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/hqdefault.jpg","width":480,"height":360}}
         * channelTitle : League of Legends
         * liveBroadcastContent : none
         */

        private String publishedAt;
        private String channelId;
        private String title;
        private String description;
        private ThumbnailsBean thumbnails;
        private String channelTitle;
        private String liveBroadcastContent;

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ThumbnailsBean getThumbnails() {
            return thumbnails;
        }

        public void setThumbnails(ThumbnailsBean thumbnails) {
            this.thumbnails = thumbnails;
        }

        public String getChannelTitle() {
            return channelTitle;
        }

        public void setChannelTitle(String channelTitle) {
            this.channelTitle = channelTitle;
        }

        public String getLiveBroadcastContent() {
            return liveBroadcastContent;
        }

        public void setLiveBroadcastContent(String liveBroadcastContent) {
            this.liveBroadcastContent = liveBroadcastContent;
        }

        public static class ThumbnailsBean {
            /**
             * default : {"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/default.jpg","width":120,"height":90}
             * medium : {"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/mqdefault.jpg","width":320,"height":180}
             * high : {"url":"https://i.ytimg.com/vi/UOxkGD8qRB4/hqdefault.jpg","width":480,"height":360}
             */

            private DefaultBean defaultX;
            private MediumBean medium;
            private HighBean high;

            public DefaultBean getDefaultX() {
                return defaultX;
            }

            public void setDefaultX(DefaultBean defaultX) {
                this.defaultX = defaultX;
            }

            public MediumBean getMedium() {
                return medium;
            }

            public void setMedium(MediumBean medium) {
                this.medium = medium;
            }

            public HighBean getHigh() {
                return high;
            }

            public void setHigh(HighBean high) {
                this.high = high;
            }

            public static class DefaultBean {
                /**
                 * url : https://i.ytimg.com/vi/UOxkGD8qRB4/default.jpg
                 * width : 120
                 * height : 90
                 */

                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class MediumBean {
                /**
                 * url : https://i.ytimg.com/vi/UOxkGD8qRB4/mqdefault.jpg
                 * width : 320
                 * height : 180
                 */

                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class HighBean {
                /**
                 * url : https://i.ytimg.com/vi/UOxkGD8qRB4/hqdefault.jpg
                 * width : 480
                 * height : 360
                 */

                private String url;
                private int width;
                private int height;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }
        }
    }
}
