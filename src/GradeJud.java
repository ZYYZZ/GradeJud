public class GradeJud {
    public static void main(String[] args){
        float myscroe = 369;
        float levelone = 451;
        System.out.println("您的高考总分: "+myscroe);
        System.out.println("第一批本科录取分数线: "+levelone);
        boolean standard;
        standard = myscroe>=levelone?true:false;  //三元表达式
        if(standard){
            System.out.println("高考结果: 通过一本录取分数线");
        }else{
            System.out.println("高考结果: 未通过一本录取分数线");
        }
    }
}
