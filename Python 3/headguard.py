import sys


def run():
    for i in sys.stdin:
        if i == '':
            break
            
        result = ''
        previous = ''
        count = 0
        for char in i:
            if previous == '':
                count += 1
                previous = char
            else:
                if char == previous:
                    count += 1
                else:
                    result += f'{count}{previous}'
                    previous = char
                    count = 1

        print(result)


if __name__ == '__main__':
    run()
