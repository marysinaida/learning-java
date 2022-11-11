public interface APIInterface {
    
    void didCancel();


    void didFailed(String reason);

    String didReceiveResult();
}
