public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int n){
        for (int i = 0; i < 100; i++){
             if (i == n) {
                errorCallback.onError("Task " + i + " is failed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
