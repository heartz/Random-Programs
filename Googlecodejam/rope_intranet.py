fileOpen=open("rope-L.in","r+")
fileOpen2=open("rope.txt","w+")
testCases=int(fileOpen.readline())
for i in range(1,testCases+1):
    wires=int(fileOpen.readline())
    a=[]
    b=[]
    total=0
    for j in range(1,wires+1):
        coordline=fileOpen.readline()
        coords=coordline.split()
        a.append(int(coords[0]))
        b.append(int(coords[1]))
    for k in range(0,wires):
        for l in range(k+1,wires):
            if((a[k]-a[l])*(b[k]-b[l])<0):
                total=total+1
    fileOpen2.write('Case #%d: %d\n'%(i,total))
    