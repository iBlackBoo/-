package 设计模式.行为型模式.命令模式;

/**
 * 调用者
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Invoker(Command command) {
        this.command = command;
    }

    void call(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
