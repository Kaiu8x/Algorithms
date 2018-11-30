x2 = int(input())
num = []
for val in range(1000010):
    num.append(0)
for i in range(2,x2):
    if(num[i]==0):
        for j in range(i+i,x2+1,i):
            num[j]=i
prim = x2 - num[x2] + 1
minn = 10000000
for i in range(prim,x2+1):
    minn = min(minn,i - num[i] + 1)
print(minn)