def run():
    cases = int(input())
    for case in range(cases):
        gears = int(input())
        maxTorque = 0
        maxGear = 0
        for gear in range(1, gears+1):
            line = input().split()
            a = int(line[0])
            b = int(line[1])
            c = int(line[2])

            torque = gettorque(a, b, c)

            if torque > maxTorque:
                maxTorque = torque
                maxGear = gear
        print(maxGear)


def gettorque(a, b, c):
    r = (-b)/(-2 * a)
    return (- a * r * r) + (b * r) + c


if __name__ == '__main__':
    run()
