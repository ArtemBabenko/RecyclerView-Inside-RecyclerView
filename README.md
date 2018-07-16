# RecyclerView Inside RecyclerView
- Simple Code
- RecyclerView containing another recyclerview
- Modify according to your requirements
- Can implement horizontal view for sub recyclerview

## For horizontal Recyclerview 
Modify this line inside your main custom adpater
```java
 // For Vertical List
 holder.list.setLayoutManager(new LinearLayoutManager(c));
 // For Horizontal List
 holder.list.setLayoutManager(new LinearLayoutManager(c, LinearLayoutManager.HORIZONTAL, false));
```