package com.gitgob.retrofit2rxjava2demo.entity;

import java.util.List;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:SortBean.java
 * @author: Zch
 * @date: 2017-03-09 14:45
 */
public class SortBean {

    /**
     * result : 1
     * catListOne : [{"id":"0001000100000000001","isDel":0,"list":[],"bcatCode":"","bcatName":"速冻食材","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000046","isDel":0,"list":[],"bcatCode":"","bcatName":"蔬菜水果","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000203","isDel":0,"list":[],"bcatCode":"","bcatName":"烧烤类","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000040","isDel":0,"list":[],"bcatCode":"","bcatName":"米面粮油","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000060","isDel":0,"list":[],"bcatCode":"","bcatName":"海鲜水产","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000068","isDel":0,"list":[],"bcatCode":"","bcatName":"酒水冷饮","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000080","isDel":0,"list":[],"bcatCode":"","bcatName":"厨房用品","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000088","isDel":0,"list":[],"bcatCode":"","bcatName":"鲜肉熟食","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000096","isDel":0,"list":[],"bcatCode":"","bcatName":"休闲零食","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000107","isDel":0,"list":[],"bcatCode":"","bcatName":"海产品","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000153","isDel":0,"list":[],"bcatCode":"","bcatName":"猪产品","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000176","isDel":0,"list":[],"bcatCode":"","bcatName":"鸡鸭产品","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000184","isDel":0,"list":[],"bcatCode":"","bcatName":"牛羊肉","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""},{"id":"0002000100000000027","isDel":0,"list":[],"bcatCode":"","bcatName":"调味干货","parantId":"","catLev":"","seqno":"","appUserId":"","operName":""}]
     */

    private ResultMapBean resultMap;

    public ResultMapBean getResultMap() {
        return resultMap;
    }

    public void setResultMap(ResultMapBean resultMap) {
        this.resultMap = resultMap;
    }

    public static class ResultMapBean {
        private String result;
        /**
         * id : 0001000100000000001
         * isDel : 0
         * list : []
         * bcatCode :
         * bcatName : 速冻食材
         * parantId :
         * catLev :
         * seqno :
         * appUserId :
         * operName :
         */

        private List<CatListOneBean> catListOne;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public List<CatListOneBean> getCatListOne() {
            return catListOne;
        }

        public void setCatListOne(List<CatListOneBean> catListOne) {
            this.catListOne = catListOne;
        }

        public static class CatListOneBean {
            private String id;
            private int isDel;
            private String bcatCode;
            private String bcatName;
            private String parantId;
            private String catLev;
            private String seqno;
            private String appUserId;
            private String operName;
            private List<?> list;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getIsDel() {
                return isDel;
            }

            public void setIsDel(int isDel) {
                this.isDel = isDel;
            }

            public String getBcatCode() {
                return bcatCode;
            }

            public void setBcatCode(String bcatCode) {
                this.bcatCode = bcatCode;
            }

            public String getBcatName() {
                return bcatName;
            }

            public void setBcatName(String bcatName) {
                this.bcatName = bcatName;
            }

            public String getParantId() {
                return parantId;
            }

            public void setParantId(String parantId) {
                this.parantId = parantId;
            }

            public String getCatLev() {
                return catLev;
            }

            public void setCatLev(String catLev) {
                this.catLev = catLev;
            }

            public String getSeqno() {
                return seqno;
            }

            public void setSeqno(String seqno) {
                this.seqno = seqno;
            }

            public String getAppUserId() {
                return appUserId;
            }

            public void setAppUserId(String appUserId) {
                this.appUserId = appUserId;
            }

            public String getOperName() {
                return operName;
            }

            public void setOperName(String operName) {
                this.operName = operName;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }
    }
}
