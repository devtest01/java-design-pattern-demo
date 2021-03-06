package patterns.others.mvcpattern;

//MVC 模式
//        MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。
//
//        Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
//        View（视图） - 视图代表模型包含的数据的可视化。
//        Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。

public class MVCPatternDemo {
    public static void main(String[] args) {
        //从数据可获取学生记录
        StudentModel model = retriveStudentFromDatabase();

        // 创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();


        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // 更新模型数据
        model.setName("张三");
        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase() {
        return new StudentModel("A001","zhangsan");
    }
}
