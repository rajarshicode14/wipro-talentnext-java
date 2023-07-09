class UserMainCode(object):
    @classmethod

    def nnGenerator(cls, input1):
        '''
            input1 : string
            Expected return type : int
        '''

        flag = 'odd'

        if int(input1[0]) % 2 == 0:
            flag = 'even'

        sum_ = 0
        passSum = ''
        remaining = False

        for i in range(len(input1)):
            remaining = False
            sum_ = sum_ + int(input1[i])

            if (sum_ % 2 == 0 and flag == 'odd') or (sum_ % 2 != 0 and flag == 'even'):
                passSum = passSum + str(sum_)
                remaining = True
                sum_ = 0

                flag = 'odd'
                if (i + 1) <= (len(input1) - 1) and int(input1[i + 1]) % 2 == 0:
                    flag = 'even'

        if remaining == False:
            passSum = passSum + str(sum_)

        return int(passSum)
