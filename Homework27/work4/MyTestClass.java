package com.alfabank.work4;

public class MyTestClass {
    private String str1 = "This is str in MyTestClass.";
    public void test() {
        System.out.println("This is test() from MyTestClass: " + str1);
        System.out.println("Call localMethod() from MyTestClass:");
        localMethod();

    }
    static class MyStaticNested {
        private String str3 = "This is MyStaticNested.";

        public String getStr3() {
            return str3;
        }

        public void callFromStaticNested() {
            MyTestClass mytest = new MyTestClass();
            System.out.println("Call str in MyTestClass from MyStaticNested: " + mytest.str1);
            MyTestClass.MyInner inn = mytest.new MyInner();
            System.out.println("Call str in MyInner from MyStaticNested: " + inn.getStr2());
            System.out.println("Call localMethod() from MyStaticNested:");
            mytest.localMethod();
        }
    }

    class MyInner {
        private String str2 = "This is MyInner class.";

        public String getStr2() {
            return str2;
        }

        public void callFromInner() {
            System.out.println("Call str in MyTestClass from MyInner: " + MyTestClass.this.str1);
            MyTestClass.MyStaticNested statnest = new MyStaticNested();
            System.out.println("Call str in MyStaticNested from MyInner: " + statnest.getStr3());
            System.out.println("Call str in MyLocal from MyInner:");
            localMethod();
        }
    }

    void localMethod() {
        System.out.println("This is localMethod().");
        class MyLocal {
            private String str2 = "This is str in MyLocal class.";

            public String getStr2() {
                return str2;
            }
            public String tLocal() {
                return str1;
            }
        }
        MyLocal loc = new MyLocal();
        System.out.println("Call getStr2() method from MyLocal class: " + loc.getStr2());
        System.out.println("Call str in MyTestClass from MyLocal class: " + loc.tLocal());
    }
}
