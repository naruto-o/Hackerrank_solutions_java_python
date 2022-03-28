# https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
# link for challenge above
length = input()
array = input()
array = array.split(' ')
array = [int(x) for x in array if x != '']
array = array[::-1]
for x in array:
    print(x, end=' ')
print('')
