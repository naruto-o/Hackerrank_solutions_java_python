# https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=true
# link for above challenge
if __name__ == '__main__':
    n = int(raw_input().strip())
if n % 2==1:
    print("Weird")
elif  (n >= 6 and n <= 20 ):
        print("Weird")
else:
    print("Not Weird")
