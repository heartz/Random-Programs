s1=input()
s2=list(s1)
s3=[ord(j) for j in s2]
loop_list = []
remain_list = []
print("++++++++++")
print("[",end="")
for i in range(0,len(s2)):
    loop=int(s3[i]/10)
    loop_list.append(loop)
    print(">",end="")
    for j in range(0,loop):
        print("+",end="")
for i in range(0,len(s2)):
    print("<",end="")
print("-]")
for i in range(0,len(s2)):
    print(">",end="")
    remain=s3[i]%10
    remain_list.append(remain)
    for j in range(0,remain):
        print("+",end="")
    print(".")
    
        
