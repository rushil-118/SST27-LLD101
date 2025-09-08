package com.example.notifications;

public abstract class NotifierDecorator implements Notifier {
    public Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(String text) {
        notifier.notify(text);
    }
}
