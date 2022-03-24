import math

def run():
    nums = [int(n) for n in input().split()]
    r = nums[0]
    c = nums[1]
    totalarea = math.pi * r**2
    cheesearea = math.pi * (r-c)**2
    print((cheesearea / totalarea) * 100)


if __name__ == '__main__':
    run()
