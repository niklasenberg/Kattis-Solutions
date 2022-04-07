def run():
    n = int(input())
    for i in range(n):
        line = input()
        exponent = line.count(',')

        babylonian = []
        if exponent == 0:
            babylonian.append(int(line))
        else:
            number = ''
            previous = ''
            for char in line:
                if char == ',' and previous == ',':
                    babylonian.append(0)
                elif char == ',':
                    babylonian.append(int(number))
                    number = ''
                else:
                    number += char
                previous = char

            if previous != ',':
                babylonian.append(int(number))
            else:
                babylonian.append(0)

        result = 0
        for num in babylonian:
            result += num * (60 ** exponent)
            exponent -= 1

        print(result)


if __name__ == '__main__':
    run()
