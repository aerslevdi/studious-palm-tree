package com.example.helper;

public interface ItemTouchHelperAdapter {

    Boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);

}
