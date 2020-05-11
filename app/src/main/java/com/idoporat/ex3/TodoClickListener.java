package com.idoporat.ex3;

/**
 * An interface whose purpose is to enable the adapter to pass information about events to the
 * MainActivity
 */
public interface TodoClickListener{
    /**
     * Constructor
     * @param t - a TodoItem object.
     */
    public void onTodoClick(TodoItem t);

    public void onTodoLongClick(TodoItem t);
}