class Node
{
protected int data;
protected Node link;
public Node()
{
link=null;
data=0;
}
public Node(int d,Node n)
{
data=d;
link=n;
}
public void setlink(Node n)
{
link=n;
}
public void setData(int d)
{
data =d;
}
public Node getlink()
{
return link;
}
public int getData()
{
return data;
}
}
class linkedQueue
{
protected Node front,rear;
protected int number;
public linkedQueue()
{
front=rear=null;
number=0;
}
public boolean isEmpty()
{
return front==null;
}
public int size()       
{
return number;
}
public void Insert(int obj)
{
Node tmp;
tmp=new Node(obj,null);
if(rear==null)
{
front=rear=tmp;
}
else
{
rear.setlink(tmp);
rear=rear.getlink();
}
number++;
}
public int Remove()
{
if(isEmpty())
return 0;
Node tmp=front;
front=tmp.getlink();
if(front==null)
rear=null;
number--;
return tmp.getData();
}
public int peep()
{
if(isEmpty())
return 0;
return front.getData();
}
}