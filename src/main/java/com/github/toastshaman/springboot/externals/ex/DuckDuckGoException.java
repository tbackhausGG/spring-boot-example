package com.github.toastshaman.springboot.externals.ex;

public class DuckDuckGoException extends RuntimeException {
    public DuckDuckGoException(String statusText) {
        super(statusText);
    }
}
