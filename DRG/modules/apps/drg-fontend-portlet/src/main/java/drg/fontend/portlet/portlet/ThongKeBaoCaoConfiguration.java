package drg.fontend.portlet.portlet;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "MainPortletConfiguration")
public interface ThongKeBaoCaoConfiguration {
    @Meta.AD(
        deflt = "",
        required = false
    )
    public String report1();
    public String report2();
    public String report3();
}
