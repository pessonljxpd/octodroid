package com.rejasupotaro.octodroid.http.params;

public enum Sort {
    STARS,
    CREATED,
    UPDATED,
    PUSHED,
    FULL_NAME;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}