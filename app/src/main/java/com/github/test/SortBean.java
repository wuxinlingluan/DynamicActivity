package com.github.test;


import java.io.Serializable;
import java.util.List;

public class SortBean implements Serializable {

    private static final long serialVersionUID = -5016686369895593303L;
    private List<CategoryOneArrayBean> categoryOneArray;

    public List<CategoryOneArrayBean> getCategoryOneArray() {
        return categoryOneArray;
    }

    public void setCategoryOneArray(List<CategoryOneArrayBean> categoryOneArray) {
        this.categoryOneArray = categoryOneArray;
    }

    public static class CategoryOneArrayBean implements Serializable  {
        private static final long serialVersionUID = 8466730804568601710L;
        /**
         * cacode : 10
         * categoryTwoArray : [{"cacode":"11","categoryThreeArray":[{"activityName":"com.github.test.ShengliangTestActivity","name":"跨区域备案"},{"activityName":"com.github.test.ShengliangTestActivity","name":"企业办理入口"}],"name":"收购资格许可"}]
         * name : 数据中心
         */

        private String cacode;
        private String name;
        private List<CategoryTwoArrayBean> categoryTwoArray;

        public String getCacode() {
            return cacode;
        }

        public void setCacode(String cacode) {
            this.cacode = cacode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<CategoryTwoArrayBean> getCategoryTwoArray() {
            return categoryTwoArray;
        }

        public void setCategoryTwoArray(List<CategoryTwoArrayBean> categoryTwoArray) {
            this.categoryTwoArray = categoryTwoArray;
        }

        public static class CategoryTwoArrayBean implements Serializable {
            private static final long serialVersionUID = 540202207285325862L;
            /**
             * cacode : 11
             * categoryThreeArray : [{"activityName":"com.github.test.ShengliangTestActivity","name":"跨区域备案"},{"activityName":"com.github.test.ShengliangTestActivity","name":"企业办理入口"}]
             * name : 收购资格许可
             */

            private String cacode;
            private String name;
            private List<CategoryThreeArrayBean> categoryThreeArray;

            public String getCacode() {
                return cacode;
            }

            public void setCacode(String cacode) {
                this.cacode = cacode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CategoryThreeArrayBean> getCategoryThreeArray() {
                return categoryThreeArray;
            }

            public void setCategoryThreeArray(List<CategoryThreeArrayBean> categoryThreeArray) {
                this.categoryThreeArray = categoryThreeArray;
            }

            public static class CategoryThreeArrayBean implements Serializable {
                private static final long serialVersionUID = -4708332913366019161L;
                /**
                 * activityName : com.github.test.ShengliangTestActivity
                 * name : 跨区域备案
                 */

                private String activityName;
                private String name;

                public String getActivityName() {
                    return activityName;
                }

                public void setActivityName(String activityName) {
                    this.activityName = activityName;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
