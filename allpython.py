'''a=244
print ("a")
a=int(input(""))
print (a)
a=int(input(""))
b=int(input(""))
print("the sum of two no's is",a+b)
print("the subtraction of two no's is",a-b)
print("the division of two no's is",a/b)
print("the multiplication of two no's is",a*b)'''

'''a=int(input(""))
b=int(input(""))
c=2*(a+b)
d=a*b
print("the perimeter is",c)
print("the area is",d)'''


'''r=int(input(""))
d=2*r
c=2*3.14*r
a=3.14*r*r
print("the diameter of circle is",d)
print("the circumfrence of circle is",c)
print("the area of circle is",a)'''


'''cm=int(input(""))
km=cm*1000
m=cm*100
print("In km",km)
print("in m",m)'''


'''a=int(input(""))
b=int(input(""))
if(a>b):
    print (a)
else:
    print (b)'''


'''a=int(input(""))
b=int(input(""))
c=int(input(""))
if(a>b):
    if(a>c):
        print(a)
    else:
        print(c)
if(b>a):
    if(b>c):
        print(b)
    else:
        print(c)'''

'''a=int(input(""))
if(a%2==0):
    print(a,"is even")
else:
    print(a,"is odd")'''


'''b=int(input(""))
h=int(input(""))
a=1/2*b*h
print("area",a)'''



'''n1=int(input(""))
n2=int(input(""))
n3=int(input(""))
n4=int(input(""))
n5=int(input(""))
t=n1+n2+n3+n4+n5;
av=t/5
per=av*100
print("total",t)
print("average",avg)
print("percentage",per)'''


'''a=input()
if(a.isalpha()):
    print(a,"is alphabet")
else:
    print(a,"is not aplphabet")'''


'''a=int(input())
if(a<0):
    print(a,"is negative")
elif(a>0):
    print(a,"is positive")
else:
    print(a,"is 0")'''


'''a=int(input())
if(a%5==0):
    print(a,"is divisible by 5")
elif(a%11==0):
    print(a,"is divisible by 11")
else:
    print(a,"is neigther divisible by 11 nir by 5")'''
'''a=input()
if(a=="a" or a=="e" or a=="i" or a=="o" or a=="u"):
    print(a,"is vowel")
else:
    print(a,"is consonant")'''


'''a=input()
if(a.isalpha()):
    print(a,"is alphabet")
elif(a.isdigit()):
    print(a,"is digit")
else:
    print(a,"is special character")'''


'''a=int(input())
if(a==1):
    print(a,"today is monday")
elif(a==2):
    print(a,"today is tuesday")
elif(a==3):
   print(a,"today is wednesday")
elif(a==4):
   print(a,"today is thursday")
elif(a==5):
   print(a,"today is friday")
elif(a==6):
   print(a,"today is saturday")
elif(a==7):
   print(a,"today is sunday")'''


'''a=int(input())
if(a==1):
    print(a,"month is having 31 days")
elif(a==2):
    print(a,"month is havng 28 or 29 days")
elif(a==3):
    print(a,"month is havng 30 days")
elif(a==4):
    print(a,"month is havng 31 days")
elif(a==5):
    print(a,"month is havng 30 days")
elif(a==6):
    print(a,"month is has 31 days")
elif(a==7):
    print(a,"month is havng 30 days")
elif(a==8):
    print(a,"month is havng 31 days")
elif(a==9):
    print(a,"month is havng 30 days")
elif(a==10):
    print(a,"month is havng 31 days")
elif(a==11):
    print(a,"month is havng 30 days")
elif(a==12):
    print(a,"month is havng 30 days")'''
'''a=int(input())
b=int(input())
c=int(input())
if((a+b+c)<=360):
    print("it's a valid triangle")
else:
    print("it's not a valid triangle")'''


'''h=int(input("enter height"))
b=int(input("enter base"))
c=int(input("enter perpendicular"))
if((h*h==(c*c)+(b*b))):
    print("triangle is valid")
else:
    print("triangle is not valid")'''
'''a=int(input())
b=int(input())
c=int(input())
if(a==b==c):
    print("it's euilateral triangle")
elif(a==b or b==c or a==c):
    print("it's isosceles triangle")
else:
    print("it's scalene triangle")'''
'''a=int(input("enter actual price"))
s=int(input("ente sales price"))
if(a>s):
    amt=a-s
    print("total loss= ",amt)
elif(s>a):
    amt=s-a
    print("total profit= ",amt)
else:
    print("no profit no loss")'''
'''phy=int(input("enter the marks of physics"))
ch=int(input("enter the marks of chemistry"))
bio=int(input("entter the marks of biology"))
math=int(input("enter the marks of math"))
grade=((phy+ch+bio+math)/5)*100
if(grade>=90):
    print("Grade A")
elif(grade>=80):
    print("Grade B")
elif(grade>=70):
    print("Grade C")
elif(grade>=60):
    print("Grade D")
elif(grade>=40):
    print("Grade E")
elif(grade<40):
    print("Grade F")'''
'''sal=int(input())
if(sal<=10000):
    hra=(20/100)*sal
    da=(80/100)*sal
    print("HRA= ",hra)
    print("DA= ",da)
elif(sal<=20000):
    hra=(25/100)*sal
    da=(90/100)*sal
    print("HRA= ",hra)
    print("DA= ",da)
else:
    hra=(30/100)*sal
    da=(95/100)*sal
    print("HRA= ",hra)
    print("DA= ",da)'''
a=int(input("enter the amount"))
if(a/2000>0):
    b=int(a/2000)
    a=a-(b*2000)
    print("two thousand",b)
if(a/500>0):
    b=int(a/500)
    a=a-(b*500)
    print("five hundred",b)
if(a/100>0):
    b=int(a/100)
    a=a-(b*100)
    print("one hundered",b)
