#TODO: Fails last test, needs to be more efficient

def run():
    n = int(input())

    for i in range(n):
        result = []
        line = input()
        index = 0

        for char in line:
            if char is '[':
                index = 0
            elif char is ']':
                index = len(result)
            elif char is '<' and index is not 0:
                result.pop(index-1)
                if index >= 1:
                    index -= 1
            elif char is not '<':
                result.insert(index, char)
                index += 1

        print(''.join(result))


if __name__ == '__main__':
    run()
