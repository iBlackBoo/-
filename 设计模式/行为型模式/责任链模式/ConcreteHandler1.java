package 设计模式.行为型模式.责任链模式;


/**
 * 具体处理角色1
 */
public class ConcreteHandler1 extends Handler {
    @Override
    void handlerRequest(String request) {
        if(request.equals("one")){
            System.out.println("具体处理者1负责处理请求...");
        }else{
          if(super.getNext() != null){
              super.getNext().handlerRequest(request);
          }else{
              System.out.println("没有人处理请求...");
          }
        }
    }
}
