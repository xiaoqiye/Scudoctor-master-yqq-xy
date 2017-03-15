package com.scudoctor.view;

/**
 * Created by xianyou on 15/03/2017.
 */

public class ArticleBox {
    private String title;
    private String content;
//        private String auther;

    //        public ArticleBox(String title,String content,String auther){
//            this.title = title;
//            this.content = content;
//            this.auther = auther;
//        }
    public ArticleBox(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
//        public void setAuther(String auther){
//            this.auther = auther;
//        }
//
//        public String getAuther(){
//            return auther;
//        }

}
