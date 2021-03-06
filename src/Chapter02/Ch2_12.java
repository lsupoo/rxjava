package Chapter02;

import io.reactivex.Observable;

public class Ch2_12 {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        //second observer
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(s -> System.out.println("Observer 2 Received: " + s));
        //first observer
        source.subscribe(s -> System.out.println("Observer 1 Received: " + s));

    }
}