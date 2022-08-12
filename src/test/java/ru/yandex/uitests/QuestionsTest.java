package ru.yandex.uitests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import ru.yandex.uitest.pages.MainPageElements;

import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class QuestionsTest extends BaseTest {

    @Parameters
    public static Object[][] BlockOfQuestionsTest() {
        return new Object[][] {
                {"������� ��� �����? � ��� ��������?", "����� � 400 ������. ������ ������� � ��������� ��� ������."},
                {"���� ����� ��������� ���������! ��� �����?", "���� ��� � ��� ���: ���� ����� � ���� �������. ���� ������ ���������� � ��������, ������ ������ ������� ��������� ������� � ���� �� ������."},
                {"��� �������������� ����� ������?", "��������, �� ���������� ����� �� 8 ���. �� �������� ������� 8 ��� � ������� ���. ������ ������� ������ ���������� � �������, ����� �� �������� ����� �������. ���� �� �������� ������� 8 ��� � 20:30, �������� ������ ���������� 9 ��� � 20:30."},
                {"����� �� �������� ������� ����� �� �������?", "������ ������� � ����������� ���. �� ����� ������ �����������."},
                {"����� �� �������� ����� ��� ������� ������� ������?", "���� ��� ���! �� ���� ���-�� ������� � ������ ����� ��������� � ��������� �� ��������� ������ 1010."},
                {"�� ��������� ������� ������ � ���������?", "������� ��������� � ��� � ������ ��������. ����� ������� �� ������ ����� � ���� ���� ������ �������� ��� ��������� � �� ���. ������� �� �����������."},
                {"����� �� �������� �����?", "��, ���� ������� �� ��������. ������ �� �����, �������������� ������� ���� �� ��������. ��� �� ����."},
                {"� ���� �� ������, ��������?", "��, �����������. ���� ���������! � ������, � ���������� �������."},
        };
    }
    private final String question;
    private final String answer;

    public QuestionsTest(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }

    @Test
    public void questionsTest() {
        MainPageElements mainPage = new MainPageElements(driver);
        boolean result = mainPage
                .scrollBlockOfQuestions()
                .clickBlockOfQuestions(question)
                .consentBlockOfQuestions(answer);
        assertTrue(result);
    }
}

