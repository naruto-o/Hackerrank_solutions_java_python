# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
# link for challenge above
if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    Max = max(arr)
    while max(arr) == Max:
        arr.remove(max(arr))
    print max(arr)

    
