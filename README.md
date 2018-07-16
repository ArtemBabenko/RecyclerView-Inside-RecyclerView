# RecyclerView Inside RecyclerView
- Simple Code
- RecyclerView containing another recyclerview
- Modify according to your requirements
- Can implement horizontal view for sub recyclerview

## For horizontal Recyclerview 
Modify this line 
```java
	//holder.list.setLayoutManager(new LinearLayoutManager(c)); // For Vertical List
    holder.list.setLayoutManager(new LinearLayoutManager(c, LinearLayoutManager.HORIZONTAL, false)); // For Horizontal List
```