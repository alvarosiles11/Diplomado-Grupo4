package util;

public abstract class Entity<TId> {

    public TId key;

    public TId getKey() {
        return key;
    }
    protected void setKey(TId key) {
        this.key = key;
    }
}
